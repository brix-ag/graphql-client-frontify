package ch.brix.gql.client.frontify.builders;

public class On_Collection extends ch.brix.gql.client.TypeBuilder {
  public On_Collection() {
    super(new ch.brix.gql.client.On("Collection"));
  }
  /**
   * `Collection` Id.
   */
  public On_Collection id() {
    _add_field("id");
    return this;
  }
  /**
   * `Collection` name.
   */
  public On_Collection name() {
    _add_field("name");
    return this;
  }
  /**
   * `Collection`'s `Asset` items list.
   */
  public On_Collection assets(Collection_assets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** `Collection`'s privacy state setting. This field will be removed. | Date: 2024-01-01T00:00:00.000+00:00
   * This field will be removed. | Date: 2024-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_Collection isPrivate() {
    _add_field("isPrivate");
    return this;
  }
  /**
   * `Collection`'s permissions of the current `User`.
   */
  public On_Collection currentUserPermissions(Collection_currentUserPermissions callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
