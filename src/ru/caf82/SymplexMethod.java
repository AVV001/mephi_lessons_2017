package ru.caf82;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Veronika on 06.11.17.
 */
public class SymplexMethod {

    static List<Float> vectorC;
    static List<List<Float>> vectorA;
    static List<Float> vectorB;

    static void readFromFile(String fileName) {
        try (BufferedReader reader =
                     new BufferedReader(new FileReader(fileName))) {

            String[] tempArray;

            tempArray = reader.readLine().split(",");
            vectorC = new ArrayList<Float>();
            for (String x : tempArray) {
                vectorC.add(Float.valueOf(x));
            }

            reader.readLine();

            vectorA = new ArrayList<>();
            String tempString;
            while (!(tempString = reader.readLine()).equals("")) {
                tempArray = tempString.split(",");
                List<Float> tempArray2 = new ArrayList<>();
                for (String x : tempArray) {
                    tempArray2.add(Float.valueOf(x));
                }
                vectorA.add(tempArray2);
            }


            tempArray = reader.readLine().split(",");
            vectorB = new ArrayList<Float>();
            for (String x : tempArray) {
                vectorB.add(Float.valueOf(x));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void symplexMethod() {
        int[] vectorAShape = new int[]{vectorA.size(), vectorA.get(0).size()};
        Float[] temp = new Float[vectorA.size() + 1];
        Arrays.fill(temp, (float) 0);
        List<Float> tempList = Arrays.asList(temp);

        for (int i = 0; i < vectorA.size(); ++i) {
            vectorA.get(i).addAll(tempList);
            vectorA.get(i).set(vectorAShape[1] + i, (float) 1);
            vectorA.get(i).add(vectorB.get(i));
        }

        for (int i = 0; i < vectorC.size(); ++i) {
            vectorC.set(i, vectorC.get(i) * -1);
        }
        vectorC.addAll(tempList);
        vectorC.set(vectorC.size() - 1, (float) 1);
        vectorC.add((float) 0);

        vectorA.add(vectorC);

        while (vectorA.get(vectorA.size() - 1).stream().filter(p -> (p < 0 &&
                vectorA.get(vectorA.size() - 1).indexOf(p) < vectorA.size()))
                .collect(Collectors.toList()).size() != 0) {
            for (int i = 0; i < 3; ++i) {
                int arg_col = vectorA.get(vectorA.size() - 1).indexOf(vectorA.get(vectorA.size() - 1)
                        .stream().min(Float::compare).get());
                List<Float> anotherTemp = new ArrayList<>();
                for (int j = 0; j < vectorA.size() - 1; ++j) {
                    anotherTemp.add(vectorA.get(j).get(vectorA.get(j).size() - 1) /
                            vectorA.get(j).get(arg_col));
                }

                int arg_row = anotherTemp.indexOf(anotherTemp.stream().min(Float::compare).get());

                float elected = vectorA.get(arg_row).get(arg_col);
                for (int j = 0; j < vectorA.get(1).size(); ++j) {
                    vectorA.get(arg_row).set(j, vectorA.get(arg_row).get(j) / elected);
                }

                for (int j = 0; j < vectorA.size(); ++j) {
                    if (j == arg_row) continue;
                    float k = vectorA.get(j).get(arg_col) / vectorA.get(arg_row).get(arg_col);
                    for (int m = 0; m < vectorA.get(0).size(); ++m) {
                        vectorA.get(j).set(m, vectorA.get(j).get(m) + vectorA.get(arg_row).get(m) * -k);
                    }
                }
            }
        }

        for (int i = 0; i < vectorAShape[0]; ++i) {
            if (vectorA.get(i).indexOf((float) 1) != -1 &&
                    vectorA.get(i).indexOf((float) 1) < vectorAShape[1]) {
                System.out.println("x[" + (vectorA.get(i).indexOf((float) 1) + 1) + "] = " +
                        vectorA.get(i).get(vectorA.get(0).size() - 1));
            }
        }
    }


}
