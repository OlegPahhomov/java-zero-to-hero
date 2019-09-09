package ee.itcollage.level13;

import java.util.List;

public class AnalysisResult {

    private List<String> palidromes;
    private List<String> others;

    public List<String> getPalidromes() {
        return palidromes;
    }

    public void setPalidromes(List<String> palidromes) {
        this.palidromes = palidromes;
    }

    public List<String> getOthers() {
        return others;
    }

    public void setOthers(List<String> others) {
        this.others = others;
    }

    public AnalysisResult(List<String> palidromes, List<String> others) {
        this.palidromes = palidromes;
        this.others = others;
    }
}