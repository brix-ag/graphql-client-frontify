package ch.brix.gql.client.frontify.builders;

public class On_CatalogTextColumn extends ch.brix.gql.client.TypeBuilder {
  public On_CatalogTextColumn() {
    super(new ch.brix.gql.client.On("CatalogTextColumn"));
  }
  /**
   * **BETA** `CatalogColumn` ID.
   */
  public On_CatalogTextColumn id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** `name` of the `CatalogColumn`.
   */
  public On_CatalogTextColumn name() {
    _add_field("name");
    return this;
  }
  /**
   * **BETA** `position` of the `CatalogColumn` for ordering.
   */
  public On_CatalogTextColumn position() {
    _add_field("position");
    return this;
  }
}
