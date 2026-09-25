package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsColorRepresentations_cmykCoated extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsCmykColorRepresentation> {
  public BrandEssentialsColorRepresentations_cmykCoated() {
    super(new ch.brix.gql.client.Call<>("cmykCoated", "BrandEssentialsCmykColorRepresentation"));
  }
  public BrandEssentialsColorRepresentations_cmykCoated onBrandEssentialsCmykColorRepresentation(On_BrandEssentialsCmykColorRepresentation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
