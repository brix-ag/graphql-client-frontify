package ch.brix.gql.client.frontify.builders;

public class CreateBrand_brand extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.Brand> {
  public CreateBrand_brand() {
    super(new ch.brix.gql.client.Call<>("brand", "Brand"));
  }
  public CreateBrand_brand onBrand(On_Brand typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
