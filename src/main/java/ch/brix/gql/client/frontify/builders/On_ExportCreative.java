package ch.brix.gql.client.frontify.builders;

public class On_ExportCreative extends ch.brix.gql.client.TypeBuilder {
  public On_ExportCreative() {
    super(new ch.brix.gql.client.On("ExportCreative"));
  }
  /**
   * The newly created `CreativeJob`.
   */
  public On_ExportCreative job(ExportCreative_job callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
