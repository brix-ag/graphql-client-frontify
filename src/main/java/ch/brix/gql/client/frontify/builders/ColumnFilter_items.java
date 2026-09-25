package ch.brix.gql.client.frontify.builders;

public class ColumnFilter_items extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.ColumnFilterItems> {
  public ColumnFilter_items() {
    super(new ch.brix.gql.client.Call<>("items", "ColumnFilterItems"));
  }
  public ColumnFilter_items onColumnFilterItems(On_ColumnFilterItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
