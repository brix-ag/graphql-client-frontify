package ch.brix.gql.client.frontify.builders;

public class RootQuery_brand extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.Brand> {
  public RootQuery_brand() {
    super(new ch.brix.gql.client.Call<>("brand", "Brand"));
  }
  public RootQuery_brand args(RootQuery_brand_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootQuery_brand onBrand(On_Brand typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
