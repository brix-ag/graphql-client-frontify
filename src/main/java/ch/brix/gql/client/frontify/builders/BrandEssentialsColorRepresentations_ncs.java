package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsColorRepresentations_ncs extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsColorSystemRepresentation> {
  public BrandEssentialsColorRepresentations_ncs() {
    super(new ch.brix.gql.client.Call<>("ncs", "BrandEssentialsColorSystemRepresentation"));
  }
  public BrandEssentialsColorRepresentations_ncs onBrandEssentialsColorSystemRepresentation(On_BrandEssentialsColorSystemRepresentation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
