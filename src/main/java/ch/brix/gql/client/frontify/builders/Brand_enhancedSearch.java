package ch.brix.gql.client.frontify.builders;

public class Brand_enhancedSearch extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEnhancedSearchItems> {
  public Brand_enhancedSearch() {
    super(new ch.brix.gql.client.Call<>("enhancedSearch", "BrandEnhancedSearchItems"));
  }
  public Brand_enhancedSearch args(Brand_enhancedSearch_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Brand_enhancedSearch onBrandEnhancedSearchItems(On_BrandEnhancedSearchItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
