package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsColorRepresentations_pantonePlastics extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsColorSystemRepresentation> {
  public BrandEssentialsColorRepresentations_pantonePlastics() {
    super(new ch.brix.gql.client.Call<>("pantonePlastics", "BrandEssentialsColorSystemRepresentation"));
  }
  public BrandEssentialsColorRepresentations_pantonePlastics onBrandEssentialsColorSystemRepresentation(On_BrandEssentialsColorSystemRepresentation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
