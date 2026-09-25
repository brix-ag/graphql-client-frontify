package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsColorRepresentations_pantoneCp extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsColorSystemRepresentation> {
  public BrandEssentialsColorRepresentations_pantoneCp() {
    super(new ch.brix.gql.client.Call<>("pantoneCp", "BrandEssentialsColorSystemRepresentation"));
  }
  public BrandEssentialsColorRepresentations_pantoneCp onBrandEssentialsColorSystemRepresentation(On_BrandEssentialsColorSystemRepresentation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
