package lab2;

/**
 * 
 * @author Alexandra
 *
 */
public class Solution {
	private int[][] x;
	private Problem p;

	Solution(int noSources, int noDestinations, Problem p) {
		x = new int[noSources][noDestinations];
		this.p = p;
	}

	public void addValue(int is, int jd, int value) {
		x[is][jd] = value;
	}

	/**
	 * 
	 * @return int
	 */
	public int computeCost() {
		int cost = 0;
		for (int i = 0; i < x.length; ++i) {
			for (int j = 0; j < x[0].length; ++j) {
				cost += x[i][j] * p.getCost(i, j);
			}
		}
		return cost;
	}

	/**
	 * @return String
	 */
	public String toString() {
		String s = "";
		for (int i = 0; i < x.length; ++i) {
			for (int j = 0; j < x[0].length; ++j) {
				if (x[i][j] != 0) {
					s += p.getSource(i).getName();
					s += "-";
					s += p.getDestination(j).getName();
					s += ": ";
					s += x[i][j];
					s += " * ";
					s += p.getCost(i, j);
					s += " = ";
					s += x[i][j] * p.getCost(i, j);
					s += "; ";

				}
			}
		}
		s += "Cost total";
		s += computeCost();
		return s;
	}
}
