package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsColorRepresentations_cmyk extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsCmykColorRepresentation> {
  public BrandEssentialsColorRepresentations_cmyk() {
    super(new ch.brix.gql.client.Call<>("cmyk", "BrandEssentialsCmykColorRepresentation"));
  }
  public BrandEssentialsColorRepresentations_cmyk onBrandEssentialsCmykColorRepresentation(On_BrandEssentialsCmykColorRepresentation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
