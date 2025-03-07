package ch.brix.gql.client.frontify.builders;

public class On_Breadcrumb extends ch.brix.gql.client.TypeBuilder {
  public On_Breadcrumb() {
    super(new ch.brix.gql.client.On("Breadcrumb"));
  }
  /**
   * `Breadcrumb` folder id.
   */
  public On_Breadcrumb id() {
    _add_field("id");
    return this;
  }
  /**
   * `Breadcrumb` folder name.
   */
  public On_Breadcrumb name() {
    _add_field("name");
    return this;
  }
}
