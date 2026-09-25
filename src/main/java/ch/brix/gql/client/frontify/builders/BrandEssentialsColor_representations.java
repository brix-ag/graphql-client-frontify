package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsColor_representations extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsColorRepresentations> {
  public BrandEssentialsColor_representations() {
    super(new ch.brix.gql.client.Call<>("representations", "BrandEssentialsColorRepresentations"));
  }
  public BrandEssentialsColor_representations onBrandEssentialsColorRepresentations(On_BrandEssentialsColorRepresentations typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
