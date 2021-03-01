package lab2;

import java.util.Arrays;

/**
 * 
 * @author Alexandra
 *
 */
public class Problem {
	private Source[] sources;
	private Destination[] destinations;

	private int supply[];
	private int demand[];
	private int cost[][];
	private int sourcesSize;
	private int destinationSize;

	Problem() {
		sources = new Source[4];
		destinations = new Destination[4];
		supply = new int[4];
		demand = new int[4];
		cost = new int[4][4];

	}

	public int getCost(int is, int id) {
		return cost[is][id];
	}

	public Source getSource(int index) {
		return sources[index];
	}

	public Destination getDestination(int index) {
		return destinations[index];
	}

	// metoda care adauga in vectorul de surse o sursa si supply-ul acesteia
	public void addSource(Source s, int supply) {
		for (int i = 0; i < sourcesSize; ++i) {
			if (sources[i].equals(s)) {// daca exista deja o sursa cu acelasi nume nu o mai adaug
				return;
			}
		}
		sources[sourcesSize] = s;
		this.supply[sourcesSize] = supply;
		sourcesSize++;

	}

	// metoda care adauga in vectorul de destinatii o destinatie si demandul
	// acesteia
	public void addDestination(Destination d, int demand) {
		for (int i = 0; i < destinationSize; ++i) {
			if (destinations[i].equals(d)) {// daca exista deja o destinatie cu acelasi nume nu o mai adaug
				return;
			}
		}
		destinations[destinationSize] = d;
		this.demand[destinationSize] = demand;
		destinationSize++;
	}

	// metoda care adauga in matricea de costuri
	public void addCost(int is, int id, int cost) {
		this.cost[is][id] = cost;
	}

	public int getSourcesSize() {
		return sourcesSize;
	}

	public void setSourcesSize(int sourcesSize) {
		this.sourcesSize = sourcesSize;
	}

	public int getDestinationSize() {
		return destinationSize;
	}

	public void setDestinationSize(int destinationSize) {
		this.destinationSize = destinationSize;
	}

	// afisez componentele problemei (nu in cea mai fericita forma, inca)
	/**
	 * @return String
	 */
	@Override
	public String toString() {
		String s = ""; // pentru cost nu pot folosi Arrays.toString asa ca il afisez manual
		for (int i = 0; i < sourcesSize; ++i) {
			for (int j = 0; j < destinationSize; ++j) {
				s += cost[i][j];
				s += " ";
			}
		}
		return "Problem [sources=" + Arrays.toString(sources) + ", destinations=" + Arrays.toString(destinations)
				+ ", supply=" + Arrays.toString(supply) + ", demand=" + Arrays.toString(demand) + ", cost=" + "[" + s
				+ "]";
	}

}
