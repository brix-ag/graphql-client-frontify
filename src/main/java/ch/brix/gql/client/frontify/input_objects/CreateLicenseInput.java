package ch.brix.gql.client.frontify.input_objects;

public class CreateLicenseInput extends ch.brix.gql.client.InputObject {
  /**
   * `Library` Id.
   */
  public CreateLicenseInput projectId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("projectId", v);
    return this;
  }
  /**
   * `License` title.
   */
  public CreateLicenseInput title(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("title", v);
    return this;
  }
  /**
   * `License` terms.
   */
  public CreateLicenseInput license(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("license", v);
    return this;
  }
  /**
   * Apply `License` to new assets by default.
   */
  @ch.brix.gql.client.DefaultValue("false")
  public CreateLicenseInput addByDefault(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("addByDefault", v);
    return this;
  }
  /**
   * Require user to accept `License` terms before download.
   */
  @ch.brix.gql.client.DefaultValue("false")
  public CreateLicenseInput requireConsensus(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("requireConsensus", v);
    return this;
  }
}
