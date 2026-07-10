package ch.brix.gql.client.frontify.builders;

public class On_DeleteLicense extends ch.brix.gql.client.TypeBuilder {
  public On_DeleteLicense() {
    super(new ch.brix.gql.client.On("DeleteLicense"));
  }
  /**
   * The Id of the deleted `License`.
   */
  public On_DeleteLicense id() {
    _add_field("id");
    return this;
  }
}
