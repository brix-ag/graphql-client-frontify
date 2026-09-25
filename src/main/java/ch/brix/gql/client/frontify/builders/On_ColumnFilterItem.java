package ch.brix.gql.client.frontify.builders;

public class On_ColumnFilterItem extends ch.brix.gql.client.TypeBuilder {
  public On_ColumnFilterItem() {
    super(new ch.brix.gql.client.On("ColumnFilterItem"));
  }
  /**
   * **BETA** The cell value.
   */
  public On_ColumnFilterItem value() {
    _add_field("value");
    return this;
  }
  /**
   * **BETA** Number of occurrences of this value.
   */
  public On_ColumnFilterItem count() {
    _add_field("count");
    return this;
  }
}
