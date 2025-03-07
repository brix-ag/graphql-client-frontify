package ch.brix.gql.client.frontify.builders;

public class On_CreateLicense extends ch.brix.gql.client.TypeBuilder {
  public On_CreateLicense() {
    super(new ch.brix.gql.client.On("CreateLicense"));
  }
  /**
   * `License` details.
   */
  public On_CreateLicense license(CreateLicense_license callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
