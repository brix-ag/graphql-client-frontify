package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsRgbaColorRepresentation_value extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsRgbaColorValue> {
  public BrandEssentialsRgbaColorRepresentation_value() {
    super(new ch.brix.gql.client.Call<>("value", "BrandEssentialsRgbaColorValue"));
  }
  public BrandEssentialsRgbaColorRepresentation_value onBrandEssentialsRgbaColorValue(On_BrandEssentialsRgbaColorValue typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
