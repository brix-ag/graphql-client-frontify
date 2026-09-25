package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsColorRepresentations_lab extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsLabColorRepresentation> {
  public BrandEssentialsColorRepresentations_lab() {
    super(new ch.brix.gql.client.Call<>("lab", "BrandEssentialsLabColorRepresentation"));
  }
  public BrandEssentialsColorRepresentations_lab onBrandEssentialsLabColorRepresentation(On_BrandEssentialsLabColorRepresentation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
