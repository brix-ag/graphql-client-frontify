package ch.brix.gql.client.frontify.input_objects;

/**
 * The fields one `Asset` update entry changes. Omitted fields are left untouched.
 */
public class AssetUpdateEntryDataInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** `Asset` title or display name. `null` clears it.
   */
  public AssetUpdateEntryDataInput title(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("title", v);
    return this;
  }
  /**
   * **BETA** `Asset` description. `null` clears it.
   */
  public AssetUpdateEntryDataInput description(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("description", v);
    return this;
  }
  /**
   * **BETA** Alternative text for the `Asset`. Used by screen readers when the asset is not decorative. `null` clears it.
   */
  public AssetUpdateEntryDataInput alternativeText(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("alternativeText", v);
    return this;
  }
  /**
   * **BETA** Whether the `Asset` is decorative. Decorative assets are skipped by screen readers. Does not accept `null`; omit the field to leave it unchanged.
   */
  public AssetUpdateEntryDataInput isDecorative(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isDecorative", v);
    return this;
  }
  /**
   * **BETA** Represents the Author of the `Asset`. Example: Photographer Name. `null` clears it.
   */
  public AssetUpdateEntryDataInput author(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("author", v);
    return this;
  }
  /**
   * **BETA** `Asset` copyright status. `UNKNOWN` is the empty state; `null` is not accepted.
   */
  public AssetUpdateEntryDataInput copyrightStatus(ch.brix.gql.client.frontify.enums.CopyrightStatus v) {
    values.put("copyrightStatus", v);
    return this;
  }
  /**
   * **BETA** `Asset` copyright notice. `null` clears it.
   */
  public AssetUpdateEntryDataInput copyrightNotice(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("copyrightNotice", v);
    return this;
  }
  /**
   * **BETA** `Asset` filename, including extension. `null` clears it.
   */
  public AssetUpdateEntryDataInput filename(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("filename", v);
    return this;
  }
  /**
   * **BETA** Availability start date. The `Asset` becomes available once the defined date is reached. `null` clears it.
   */
  public AssetUpdateEntryDataInput beginsAt(ch.brix.gql.client.frontify.scalars.DateTimeScalar v) {
    values.put("beginsAt", v);
    return this;
  }
  /**
   * **BETA** Expiry date. The `Asset` expires once the defined date is reached. `null` clears it.
   */
  public AssetUpdateEntryDataInput expiresAt(ch.brix.gql.client.frontify.scalars.DateTimeScalar v) {
    values.put("expiresAt", v);
    return this;
  }
  /**
   * **BETA** Tags to add to the `Asset`. Existing tags are kept; an empty list equals omitting the field.
   */
  @ch.brix.gql.client.DefaultValue("null")
  public AssetUpdateEntryDataInput addTags(java.util.List<ch.brix.gql.client.frontify.input_objects.TagInput> v) {
    values.put("addTags", v);
    return this;
  }
  /**
   * **BETA** Tags to remove from the `Asset`. Applied after `addTags` — a tag listed in both ends up removed. An empty list equals omitting the field.
   */
  @ch.brix.gql.client.DefaultValue("null")
  public AssetUpdateEntryDataInput removeTags(java.util.List<ch.brix.gql.client.frontify.input_objects.TagInput> v) {
    values.put("removeTags", v);
    return this;
  }
  /**
   * **BETA** The `WorkflowStatus` to assign to the `Asset`. `null` unassigns the current status.
   */
  public AssetUpdateEntryDataInput workflowStatus(ch.brix.gql.client.frontify.input_objects.WorkflowStatusAssignmentInput v) {
    values.put("workflowStatus", v);
    return this;
  }
  /**
   * **BETA** Custom metadata values to set on the `Asset`. Setting a value for a property deletes its current value on this `Asset` and stores the one you specify; properties not listed are untouched.
   */
  @ch.brix.gql.client.DefaultValue("null")
  public AssetUpdateEntryDataInput customMetadata(java.util.List<ch.brix.gql.client.frontify.input_objects.CustomMetadataEntryInput> v) {
    values.put("customMetadata", v);
    return this;
  }
  /**
   * **BETA** Library `Licenses` to add to the `Asset`.
   */
  @ch.brix.gql.client.DefaultValue("null")
  public AssetUpdateEntryDataInput addLicenses(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("addLicenses", v);
    return this;
  }
  /**
   * **BETA** `Collection` ids to add the `Asset` to. Only curated collections in the call's `Library` are accepted. An empty list equals omitting the field.
   */
  @ch.brix.gql.client.DefaultValue("null")
  public AssetUpdateEntryDataInput addCollections(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("addCollections", v);
    return this;
  }
}
