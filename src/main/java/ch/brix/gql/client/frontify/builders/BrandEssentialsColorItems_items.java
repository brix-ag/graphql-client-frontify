package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsColorItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.BrandEssentialsColor>> {
  public BrandEssentialsColorItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "BrandEssentialsColor"));
  }
  public BrandEssentialsColorItems_items onBrandEssentialsColor(On_BrandEssentialsColor typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
