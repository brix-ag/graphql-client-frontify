package ch.brix.gql.client.frontify.builders;

public class Catalog_columnFilter extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.ColumnFilter> {
  public Catalog_columnFilter() {
    super(new ch.brix.gql.client.Call<>("columnFilter", "ColumnFilter"));
  }
  public Catalog_columnFilter args(Catalog_columnFilter_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Catalog_columnFilter onColumnFilter(On_ColumnFilter typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
