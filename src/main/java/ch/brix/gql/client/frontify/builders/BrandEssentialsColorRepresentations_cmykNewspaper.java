package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsColorRepresentations_cmykNewspaper extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsCmykColorRepresentation> {
  public BrandEssentialsColorRepresentations_cmykNewspaper() {
    super(new ch.brix.gql.client.Call<>("cmykNewspaper", "BrandEssentialsCmykColorRepresentation"));
  }
  public BrandEssentialsColorRepresentations_cmykNewspaper onBrandEssentialsCmykColorRepresentation(On_BrandEssentialsCmykColorRepresentation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
