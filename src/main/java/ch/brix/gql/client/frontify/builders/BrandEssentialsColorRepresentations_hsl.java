package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsColorRepresentations_hsl extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsHslColorRepresentation> {
  public BrandEssentialsColorRepresentations_hsl() {
    super(new ch.brix.gql.client.Call<>("hsl", "BrandEssentialsHslColorRepresentation"));
  }
  public BrandEssentialsColorRepresentations_hsl onBrandEssentialsHslColorRepresentation(On_BrandEssentialsHslColorRepresentation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
