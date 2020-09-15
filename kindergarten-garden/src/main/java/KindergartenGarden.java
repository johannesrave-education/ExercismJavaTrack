import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class KindergartenGarden {
    String garden;

    KindergartenGarden(String garden) {
        this.garden = garden.replace("\n", "");
    }

    List<Plant> getPlantsOfStudent(String student) {
        return IntStream.range(0, garden.length())
                .filter(index -> isStudentsPlot(index, student))
                .mapToObj(plot -> Plant.getPlant(garden.charAt(plot)))
                .collect(Collectors.toList());
    }

    private boolean isStudentsPlot(int plot, String student) {
        int fstRow = (student.charAt(0) - 'A') * 2;
        int sndRow = fstRow + garden.length()/2;
        return (plot == fstRow || plot == fstRow+1 || plot == sndRow || plot == sndRow+1);
    }
}
