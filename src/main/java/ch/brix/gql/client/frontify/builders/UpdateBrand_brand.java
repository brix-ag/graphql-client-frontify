package ch.brix.gql.client.frontify.builders;

public class UpdateBrand_brand extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.Brand> {
  public UpdateBrand_brand() {
    super(new ch.brix.gql.client.Call<>("brand", "Brand"));
  }
  public UpdateBrand_brand onBrand(On_Brand typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
