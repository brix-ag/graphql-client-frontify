package ch.brix.gql.client.frontify.builders;

public class BrandEnhancedSearchItems_edges extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.BrandSearchResultEdge>> {
  public BrandEnhancedSearchItems_edges() {
    super(new ch.brix.gql.client.Call<>("edges", "BrandSearchResultEdge"));
  }
  public BrandEnhancedSearchItems_edges onBrandSearchResultEdge(On_BrandSearchResultEdge typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
