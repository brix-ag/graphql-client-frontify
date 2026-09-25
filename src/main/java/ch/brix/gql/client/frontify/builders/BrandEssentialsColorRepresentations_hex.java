package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsColorRepresentations_hex extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsHexColorRepresentation> {
  public BrandEssentialsColorRepresentations_hex() {
    super(new ch.brix.gql.client.Call<>("hex", "BrandEssentialsHexColorRepresentation"));
  }
  public BrandEssentialsColorRepresentations_hex onBrandEssentialsHexColorRepresentation(On_BrandEssentialsHexColorRepresentation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
