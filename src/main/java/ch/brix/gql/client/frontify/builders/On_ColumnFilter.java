package ch.brix.gql.client.frontify.builders;

public class On_ColumnFilter extends ch.brix.gql.client.TypeBuilder {
  public On_ColumnFilter() {
    super(new ch.brix.gql.client.On("ColumnFilter"));
  }
  /**
   * **BETA** The column ID.
   */
  public On_ColumnFilter columnId() {
    _add_field("columnId");
    return this;
  }
  /**
   * **BETA** The column name.
   */
  public On_ColumnFilter columnName() {
    _add_field("columnName");
    return this;
  }
  /**
   * **BETA** Paginated filter values with counts.
   */
  public On_ColumnFilter items(ColumnFilter_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
