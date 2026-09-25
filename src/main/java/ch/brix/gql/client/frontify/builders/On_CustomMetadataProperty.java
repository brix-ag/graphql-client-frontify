package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataProperty extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataProperty() {
    super(new ch.brix.gql.client.On("CustomMetadataProperty"));
  }
  /**
   * `CustomMetadataProperty` Id.
   */
  public On_CustomMetadataProperty id() {
    _add_field("id");
    return this;
  }
  /**
   * `User` who created the `CustomMetadataProperty`.
   */
  public On_CustomMetadataProperty creator(CustomMetadataProperty_creator callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `CustomMetadataProperty` creation.
   */
  public On_CustomMetadataProperty createdAt() {
    _add_field("createdAt");
    return this;
  }
  /**
   * `User` who last modified the `CustomMetadataProperty`.
   */
  public On_CustomMetadataProperty modifier(CustomMetadataProperty_modifier callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `CustomMetadataProperty`'s last modification.
   */
  public On_CustomMetadataProperty modifiedAt() {
    _add_field("modifiedAt");
    return this;
  }
  /**
   * `CustomMetadataProperty` name.
   */
  public On_CustomMetadataProperty name() {
    _add_field("name");
    return this;
  }
  /**
   * `CustomMetadataProperty` type details.
   */
  public On_CustomMetadataProperty type(CustomMetadataProperty_type callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `CustomMetadataProperty` help text.
   */
  public On_CustomMetadataProperty helpText() {
    _add_field("helpText");
    return this;
  }
  /**
   * Indicates if a `CustomMetadataProperty` is required to be defined.
   */
  public On_CustomMetadataProperty isRequired() {
    _add_field("isRequired");
    return this;
  }
  /**
   * **BETA** Indicates if a `CustomMetadataProperty` is searchable.
   */
  public On_CustomMetadataProperty isSearchable() {
    _add_field("isSearchable");
    return this;
  }
  /**
   * **BETA** Indicates if a `CustomMetadataProperty` is viewable. This is a stored flag that hides the property from users entirely, independent of the current user's access. See `currentUserPermissions` for the per-request, access-rule-based canEdit/canAdmin checks.
   */
  public On_CustomMetadataProperty isViewable() {
    _add_field("isViewable");
    return this;
  }
  /**
   * `CustomMetadataProperty` value set to newly update `Assets` by default.
   */
  public On_CustomMetadataProperty defaultValue() {
    _add_field("defaultValue");
    return this;
  }
  /**
   * **BETA** `CustomMetadataPropertyDependency` details.
   */
  public On_CustomMetadataProperty dependency(CustomMetadataProperty_dependency callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** `CustomMetadataProperty` Ids that cannot be used as dependee properties.
   */
  public On_CustomMetadataProperty forbiddenDependeePropertyIds() {
    _add_field("forbiddenDependeePropertyIds");
    return this;
  }
  /**
   * **BETA** `CustomMetadataProperty` permissions.
   */
  public On_CustomMetadataProperty permissions(CustomMetadataProperty_permissions callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
