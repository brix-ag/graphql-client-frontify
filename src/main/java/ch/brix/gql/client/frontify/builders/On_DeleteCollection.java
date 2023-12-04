package ch.brix.gql.client.frontify.builders;

public class On_DeleteCollection extends ch.brix.gql.client.TypeBuilder {
  public On_DeleteCollection() {
    super(new ch.brix.gql.client.On("DeleteCollection"));
  }
  /**
   * The Id of the deleted `Collection`.
   */
  public On_DeleteCollection id() {
    _add_field("id");
    return this;
  }
  /**
   * **DEPRECATED** `Collection` details. This field will be removed. Use `id` instead. | Date: 2024-01-01T00:00:00.000+00:00
   * This field will be removed. Use `id` instead. | Date: 2024-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_DeleteCollection collection(DeleteCollection_collection callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
