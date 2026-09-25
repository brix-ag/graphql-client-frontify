package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsColorRepresentations_rgba extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsRgbaColorRepresentation> {
  public BrandEssentialsColorRepresentations_rgba() {
    super(new ch.brix.gql.client.Call<>("rgba", "BrandEssentialsRgbaColorRepresentation"));
  }
  public BrandEssentialsColorRepresentations_rgba onBrandEssentialsRgbaColorRepresentation(On_BrandEssentialsRgbaColorRepresentation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
