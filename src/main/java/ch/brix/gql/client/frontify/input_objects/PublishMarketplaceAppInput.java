package ch.brix.gql.client.frontify.input_objects;

public class PublishMarketplaceAppInput extends ch.brix.gql.client.InputObject {
  /**
   * The marketplace app ID to publish.
   */
  public PublishMarketplaceAppInput appId(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("appId", v);
    return this;
  }
  /**
   * Release notes for this version.
   */
  public PublishMarketplaceAppInput releaseNotes(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("releaseNotes", v);
    return this;
  }
  /**
   * The marketplace app availability.
   */
  @ch.brix.gql.client.DefaultValue("null")
  public PublishMarketplaceAppInput availability(ch.brix.gql.client.frontify.enums.MarketplaceAppAvailability v) {
    values.put("availability", v);
    return this;
  }
}
