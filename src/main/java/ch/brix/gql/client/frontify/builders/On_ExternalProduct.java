package ch.brix.gql.client.frontify.builders;

public class On_ExternalProduct extends ch.brix.gql.client.TypeBuilder {
  public On_ExternalProduct() {
    super(new ch.brix.gql.client.On("ExternalProduct"));
  }
  /**
   * `External product` Id.
   */
  public On_ExternalProduct id() {
    _add_field("id");
    return this;
  }
  /**
   * `External product` name.
   */
  public On_ExternalProduct name() {
    _add_field("name");
    return this;
  }
  /**
   * `External product` externalId.
   */
  public On_ExternalProduct externalId() {
    _add_field("externalId");
    return this;
  }
  /**
   * `External product` title.
   */
  public On_ExternalProduct title() {
    _add_field("title");
    return this;
  }
}
