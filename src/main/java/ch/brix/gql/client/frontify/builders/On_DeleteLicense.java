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
  /**
   * **DEPRECATED** `License` details. This field will be removed. Use `id` instead. | Date: 2024-01-01T00:00:00.000+00:00
   * This field will be removed. Use `id` instead. | Date: 2024-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_DeleteLicense license(DeleteLicense_license callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
