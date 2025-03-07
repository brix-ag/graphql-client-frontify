package ch.brix.gql.client.frontify.input_objects;

public class CreateExternalAssetInput extends ch.brix.gql.client.InputObject {
  /**
   * Destination `Project` Id.
   */
  public CreateExternalAssetInput projectId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("projectId", v);
    return this;
  }
  /**
   * External `Asset` `Url`.
   */
  public CreateExternalAssetInput url(ch.brix.gql.client.frontify.scalars.UrlScalar v) {
    values.put("url", v);
    return this;
  }
  /**
   * External `Asset` title or display name.
   */
  public CreateExternalAssetInput title(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("title", v);
    return this;
  }
  /**
   * External `Asset` description.
   */
  @ch.brix.gql.client.DefaultValue("\"\"")
  public CreateExternalAssetInput description(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("description", v);
    return this;
  }
  /**
   * External `Asset` fixed width.
   */
  public CreateExternalAssetInput width(ch.brix.gql.client.frontify.scalars.IntScalar v) {
    values.put("width", v);
    return this;
  }
  /**
   * External `Asset` fixed height.
   */
  public CreateExternalAssetInput height(ch.brix.gql.client.frontify.scalars.IntScalar v) {
    values.put("height", v);
    return this;
  }
  /**
   * External `Asset` allow interactions.
   */
  @ch.brix.gql.client.DefaultValue("true")
  public CreateExternalAssetInput allowInteractions(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("allowInteractions", v);
    return this;
  }
  /**
   * External `Asset` external Id.
   */
  public CreateExternalAssetInput externalId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("externalId", v);
    return this;
  }
  /**
   * External `Asset` copyright details.
   */
  public CreateExternalAssetInput copyright(ch.brix.gql.client.frontify.input_objects.CreateCopyrightInput v) {
    values.put("copyright", v);
    return this;
  }
  /**
   * External `Asset` destination folder. Folders will be created if they don't exist.
   */
  @ch.brix.gql.client.DefaultValue("[]")
  public CreateExternalAssetInput directory(java.util.List<ch.brix.gql.client.frontify.scalars.StringScalar> v) {
    values.put("directory", v);
    return this;
  }
  /**
   * Expiry Date. External `Asset` will expire once the defined date is reached.
   */
  public CreateExternalAssetInput expiresAt(ch.brix.gql.client.frontify.scalars.DateTimeScalar v) {
    values.put("expiresAt", v);
    return this;
  }
  /**
   * Represents the Author of the External `Asset`.
   */
  @ch.brix.gql.client.DefaultValue("\"\"")
  public CreateExternalAssetInput author(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("author", v);
    return this;
  }
}
