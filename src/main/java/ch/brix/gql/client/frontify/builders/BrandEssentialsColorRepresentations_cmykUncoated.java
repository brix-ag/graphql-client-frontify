package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsColorRepresentations_cmykUncoated extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsCmykColorRepresentation> {
  public BrandEssentialsColorRepresentations_cmykUncoated() {
    super(new ch.brix.gql.client.Call<>("cmykUncoated", "BrandEssentialsCmykColorRepresentation"));
  }
  public BrandEssentialsColorRepresentations_cmykUncoated onBrandEssentialsCmykColorRepresentation(On_BrandEssentialsCmykColorRepresentation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
