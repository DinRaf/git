
public class Detail {
	private String material;
	private String purpose;

	private Integer weight;

	private Integer price;
	public Detail(String material, String purpose, Integer weight, Integer price) {
		this.material = material;
		this.purpose = purpose;
		this.weight = weight;
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public Detail setMaterial(String material) {
		this.material = material;
		return this;
	}

	public String getPurpose() {
		return purpose;
	}

	public Detail setPurpose(String purpose) {
		this.purpose = purpose;
		return this;
	}

	public Integer getWeight() {
		return weight;
	}

	public Detail setWeight(Integer weight) {
		this.weight = weight;
		return this;
	}

	public Integer getPrice() {
		return price;
	}

	public Detail setPrice(Integer price) {
		this.price = price;
		return this;
	}

	@Override
	public String toString() {
		return "Detail{" +
				"material='" + material + '\'' +
				", purpose='" + purpose + '\'' +
				", weight=" + weight +
				", price=" + price +
				'}';
	}
}
