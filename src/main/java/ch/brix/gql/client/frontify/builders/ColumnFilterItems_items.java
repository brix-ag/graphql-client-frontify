package ch.brix.gql.client.frontify.builders;

public class ColumnFilterItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.ColumnFilterItem>> {
  public ColumnFilterItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "ColumnFilterItem"));
  }
  public ColumnFilterItems_items onColumnFilterItem(On_ColumnFilterItem typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
