package ch.brix.gql.client.frontify.builders;

public class On_CatalogColumn extends ch.brix.gql.client.TypeBuilder {
  public On_CatalogColumn() {
    super(new ch.brix.gql.client.On("CatalogColumn"));
  }
  /**
   * **BETA** `CatalogColumn` ID.
   */
  public On_CatalogColumn id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** `name` of the `CatalogColumn`.
   */
  public On_CatalogColumn name() {
    _add_field("name");
    return this;
  }
  /**
   * **BETA** `position` of the `CatalogColumn` for ordering.
   */
  public On_CatalogColumn position() {
    _add_field("position");
    return this;
  }
}
