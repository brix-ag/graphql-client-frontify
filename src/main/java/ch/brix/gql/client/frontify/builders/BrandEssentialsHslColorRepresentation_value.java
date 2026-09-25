package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsHslColorRepresentation_value extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsHslColorValue> {
  public BrandEssentialsHslColorRepresentation_value() {
    super(new ch.brix.gql.client.Call<>("value", "BrandEssentialsHslColorValue"));
  }
  public BrandEssentialsHslColorRepresentation_value onBrandEssentialsHslColorValue(On_BrandEssentialsHslColorValue typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
