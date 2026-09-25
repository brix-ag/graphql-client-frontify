package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsLabColorRepresentation_value extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsLabColorValue> {
  public BrandEssentialsLabColorRepresentation_value() {
    super(new ch.brix.gql.client.Call<>("value", "BrandEssentialsLabColorValue"));
  }
  public BrandEssentialsLabColorRepresentation_value onBrandEssentialsLabColorValue(On_BrandEssentialsLabColorValue typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
