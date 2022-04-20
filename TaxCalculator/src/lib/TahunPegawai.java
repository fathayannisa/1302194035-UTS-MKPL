package lib;

public class TahunPegawai {
    private int yearJoined;
	private int monthJoined;
	private int dayJoined;
	private int monthWorkingInYear;

    public TahunPegawai(int yearJoined, int monthJoined, int dayJoined, int monthWorkingInYear) {
		this.monthJoined = monthJoined;
		this.dayJoined = dayJoined;
        this.monthWorkingInYear = monthWorkingInYear;
	}
}
