package ch.brix.gql.client.frontify.builders;

public class RootQuery_catalog extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.Catalog> {
  public RootQuery_catalog() {
    super(new ch.brix.gql.client.Call<>("catalog", "Catalog"));
  }
  public RootQuery_catalog args(RootQuery_catalog_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootQuery_catalog onCatalog(On_Catalog typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
