package ch.brix.gql.client.frontify.builders;

public class RootQuery_brands extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.Brand>> {
  public RootQuery_brands() {
    super(new ch.brix.gql.client.Call<>("brands", "Brand"));
  }
  public RootQuery_brands onBrand(On_Brand typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
