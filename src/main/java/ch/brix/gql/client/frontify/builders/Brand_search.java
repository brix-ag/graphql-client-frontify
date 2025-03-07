package ch.brix.gql.client.frontify.builders;

public class Brand_search extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandSearchItems> {
  public Brand_search() {
    super(new ch.brix.gql.client.Call<>("search", "BrandSearchItems"));
  }
  public Brand_search args(Brand_search_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Brand_search onBrandSearchItems(On_BrandSearchItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
