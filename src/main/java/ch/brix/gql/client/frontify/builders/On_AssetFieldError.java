package ch.brix.gql.client.frontify.builders;

public class On_AssetFieldError extends ch.brix.gql.client.TypeBuilder {
  public On_AssetFieldError() {
    super(new ch.brix.gql.client.On("AssetFieldError"));
  }
  /**
   * **BETA** The input field that did not apply.
   */
  public On_AssetFieldError field() {
    _add_field("field");
    return this;
  }
  /**
   * **BETA** Opaque id of the referenced property, license, or collection. Set only for `CUSTOM_METADATA`, `ADD_LICENSES`, and `ADD_COLLECTIONS` field errors; `null` otherwise.
   */
  public On_AssetFieldError id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** Why the field did not apply.
   */
  public On_AssetFieldError code() {
    _add_field("code");
    return this;
  }
}
