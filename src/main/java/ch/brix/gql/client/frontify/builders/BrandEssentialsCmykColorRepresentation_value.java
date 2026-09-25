package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsCmykColorRepresentation_value extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsCmykColorValue> {
  public BrandEssentialsCmykColorRepresentation_value() {
    super(new ch.brix.gql.client.Call<>("value", "BrandEssentialsCmykColorValue"));
  }
  public BrandEssentialsCmykColorRepresentation_value onBrandEssentialsCmykColorValue(On_BrandEssentialsCmykColorValue typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
