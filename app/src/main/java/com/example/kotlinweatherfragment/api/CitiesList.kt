package com.example.kotlinweatherfragment.api

import com.example.kotlinweatherfragment.City

class CitiesList {
    fun cityInit(): ArrayList<City> {
        val citiesArrayList = arrayListOf<City>()

        citiesArrayList.add(
            City(
                "Amsterdam", "https://s183vlx.storage.yandex.net/rdisk/" +
                        "ff5cfd5ad0b50204c3af3da5174a78f8c052a1dc71d154cc8f486c16b1952a3f/63d7d3dc/" +
                        "L2dzamNLZkNWhGV8nShcYdpfPoeyc7ZdVi-9fXdmneNVspLq7N4GZw5NYcj9X1Dt2u4lLImSmZNGdhBcg0nDWw==?" +
                        "uid=283737439&filename=amsterdam.png&disposition=inline&hash=&limit=" +
                        "0&content_type=image%2Fpng&owner_uid=283737439&fsize=35335&hid=e46ca99f709a5cb44edf4e89a5f72b68&media_type" +
                        "=image&tknv=v2&etag=7804a61eb4e11246f2104fd0abdf4cac&rtoken=" +
                        "CW87NMGhFgUT&force_default=yes&ycrid=na-205dea8e67e28562038617333051dea6" +
                        "-downloader2f&ts=5f37c0477af00&s=0ac5af15cf0f6b07043fccbb2027912aaacaa84d0a9596230df56a4ec7c1c3b0&pb=" +
                        "U2FsdGVkX19yHtOe587CeSmyO61mrhkHO7e9lw29CpCOtaKbQCUfNG6XKXn3Q_hY6aIVbcoTae7KKSdUuzsW1iXkvM92a4JrQrLNZ2l6d_A"
            )
        )

        citiesArrayList.add(
            City(
                "Barselona", "https://s777sas.storage.yandex.net/rdisk/" +
                        "38e4994e65dd3eb516b48d8bee4aabb712b713ec178d5c4dfc441c4d11775653/63d7d44f/" +
                        "L2dzamNLZkNWhGV8nShcYRvN0OpLp5a_aXfIR5nOltYGL4HKh4_uwabQHG9AduQ2LJVgpa1CWUFLMEEVrVc9fg=" +
                        "=?uid=283737439&filename=barselona.png&disposition=inline&hash=&limit=0&content_type=" +
                        "image%2Fpng&owner_uid=283737439&fsize=43684&hid=a49653043e685b6d40c921cc969d47e9&media_type=" +
                        "image&tknv=v2&etag=876b5582420fe5f8b65c9402713ed462&rtoken=sywGG5mVbYfW&force_default=yes&ycrid=" +
                        "na-45b7998dd3728ab4dd0bc97bfb2b83ca-downloader2f&ts=5f37c0b5271c0&s=" +
                        "b97dc81da410c9d4f0a7f94954173170baff43043f7987df321908413dc94ae9&pb=" +
                        "U2FsdGVkX18dlgBHd9W7AYAetknZrOnwr-huSSUgAFCBqUwVGy5BIHF_79Ic_bfWVFR5ba6jN-O_xvGqCNRYvGMaf9SdkXAs4z0jQulrZY0"
            )
        )

        citiesArrayList.add(
            City(
                "New York", "https://s380vla.storage.yandex.net/rdisk/" +
                        "af0e20b6b8f9527cc8ab9275e629c8c95ba8862c20e6ce1b95e07e9ddbfc24f6/63d7d49e/" +
                        "L2dzamNLZkNWhGV8nShcYeJEuzAqMz_evnvyuHDuRJRlQ13Ncwon4GeKe-6lHB92OHJ4fgxF49rtWPm1Ljte4Q=" +
                        "=?uid=283737439&filename=new_york.png&disposition=inline&hash=&limit=0&content_type=" +
                        "image%2Fpng&owner_uid=283737439&fsize=44269&hid=1549871b5059c7a93d2bdd08974be626&media_type=" +
                        "image&tknv=v2&etag=28dfc032e23b8138d9f586f1bc661e58&rtoken=iuv7CAoVObXG&force_default=yes&ycrid" +
                        "=na-b7f2bdd85343739fe8d0ed1fd41743e3-downloader2f&ts=5f37c1007e380&s=" +
                        "2aae8fe875e730a3e003cf4f941a62f811b49f39f26590c0da65c3fb443e8b3f&pb=" +
                        "U2FsdGVkX1-6SMM9G0il66qzdthALeS-IE5Pil2eAlU8-KyJXzkP2D_EPQ1V2Dadk26Q-JtHTggaREFcmz5VETCR5gEpQLUdvxmm1O47ROk"
            )
        )

        citiesArrayList.add(
            City(
                "Prague", "https://s20iva.storage.yandex.net/rdisk/" +
                        "ac569b48bc6f3da001fa7e85b3ec333d61c4fb8525a51e1649e64905088cea94/63d7d4e0/" +
                        "L2dzamNLZkNWhGV8nShcYfAz4E3CN_BFRtOi2TAGUzBT9QSzGNEZsTOcMyk8X--xnDCYroXm7F0FYMpacgmeZw=" +
                        "=?uid=283737439&filename=prague.png&disposition=inline&hash=&limit=0&content_type=" +
                        "image%2Fpng&owner_uid=283737439&fsize=35824&hid=8bc608608caba8d79248607b0f181797&media_type=" +
                        "image&tknv=v2&etag=30a601aa8b498b75d5af7c4c8fd979dd&rtoken=dVjiYLGzE1AY&force_default=" +
                        "yes&ycrid=na-25da3aa58fcc7fa2ed0c1734eddb9b81-downloader2f&ts=5f37c13f6f800&s=" +
                        "9de7d77ee3ce65e39837e57929eb467470899e1231ad1bfb1ce55378dcbe7f0f&pb=" +
                        "U2FsdGVkX1_uFACGgTD5rD3egnmYYt-a1GmgUJIlU4BND4QTpmWzDe9hi8pC0Ry4dnJWpAaK00OP14zjBPfgRUBNSpn1YeDz3ennFCSWsK4"
            )
        )

        citiesArrayList.add(
            City(
                "Tokio", "https://s92vla.storage.yandex.net/rdisk/" +
                        "691c333227cf4fabde2a977aa4802d9c9b0d381cc837b498e5c48d19880a049f/63d7d540/" +
                        "L2dzamNLZkNWhGV8nShcYeeBVjQbxhxlF3b6b-1dw7NgfrmfD_6PqzkVORl3eYMHWwX9WESdCkG8wkOt7J_XNA=" +
                        "=?uid=283737439&filename=tokio.png&disposition=inline&hash=&limit=0&content_type=" +
                        "image%2Fpng&owner_uid=283737439&fsize=44180&hid=1b32ae19a49292e357afec4d662ab6cd&media_type=" +
                        "image&tknv=v2&etag=447bee2dbc71fe42f75af675b39a47df&rtoken=oEUmmz9V9B6d&force_default=yes&ycrid=" +
                        "na-4bdfc7a8ab6d0bf42ba4faf392b479d7-downloader2f&ts=5f37c19afd000&s=" +
                        "835fb1a82a83402494ab0b59bae1690ff5bd9120313d269b6420a57bd99684f4&pb=" +
                        "U2FsdGVkX1-rwwEDUUJZdHOlXw6i78M3tQekhgHhXl2WgxECpA8Y8TYNxxGKsWrDP9g9080Tm1caJB3_R2C84J7zStS4QaCLuO3jl5onpj0"
            )
        )

        citiesArrayList.add(
            City(
                "Venice", "https://s357iva.storage.yandex.net/rdisk/" +
                        "84098ad48a44c7172d797523e3a3ff70913691d62b158bc0c846fb3d1a68d0f9/63d7d57e/" +
                        "L2dzamNLZkNWhGV8nShcYa-qrbwBpnxULj6X0C_qnAmKgJo6qXrCcNpKPwCC8Cc0SGu-jG0RvLEjTmwQzKKTig=" +
                        "=?uid=283737439&filename=venice.png&disposition=inline&hash=&limit=0&content_type=" +
                        "image%2Fpng&owner_uid=283737439&fsize=37133&hid=cc49259c29e1906aa8f5209edfa35078&media_type=" +
                        "image&tknv=v2&etag=b5b950f1887c7d12c6387df6445d732a&rtoken=iR4MnxuIJSgF&force_default=yes&ycrid=" +
                        "na-81cc7e800fdef5a5ad9d1bdf9a258c53-downloader2f&ts=5f37c1d61db80&s=" +
                        "cc26da2d611651b17e59886cfca4da703903dbf0182c83318977d89d98ab8523&pb=" +
                        "U2FsdGVkX19bINYipwe43ZYqdPBZ5VvRhizbvadlbBeXazc5oyB3DW6E9gEOZOFOiQDfVTIkdSnawExyyGwMt7dEcPP2bhS9oBc3Ut-49Sg"
            )
        )

        citiesArrayList.add(
            City(
                "Vienna", "https://s33vla.storage.yandex.net/rdisk/" +
                        "2b1ef3a1079360b6977a2aa9a043df933f4396454eb7c186c37aa005bb8c9c92/63d7d5c3/" +
                        "L2dzamNLZkNWhGV8nShcYZFUcd_pu8oLLnxnltxysxOToTlo_wIz6NboBnCMFIAeROEBKq2lK1tboG_atWX6sA=" +
                        "=?uid=283737439&filename=vienna.png&disposition=inline&hash=&limit=0&content_type=" +
                        "image%2Fpng&owner_uid=283737439&fsize=39361&hid=21787e6298cd514045751baf271c55b8&media_type=" +
                        "image&tknv=v2&etag=810a820a4d2ae84eaac3281c806a08d7&rtoken=TIAl8iPV39tX&force_default=" +
                        "yes&ycrid=na-5986b895dc334ae230254c4001fe82e1-downloader2f&ts=" +
                        "5f37c217eb6c0&s=6452df25a2793af6f1ffb3261ee31c41b41acaee7b7afb0172e5a1b8e7dfe268&pb=" +
                        "U2FsdGVkX18XzIFbVUmHW4LnghpDdNA7PCNckk0JW1Cuw2MYQrDPCb0UT5aBZJ9sqkP4I8GVDmNZLdls7334MK8tnMDg1SMwvAK-NWbwsG8"
            )
        )

        citiesArrayList.add(
            City(
                "Warsaw", "https://s72vlx.storage.yandex.net/rdisk/" +
                        "de0de79f81ce72ce1c7cc94937ee2605ecf5850e5fcea7447e1fa2f722d014cf/63d7d5ff/" +
                        "L2dzamNLZkNWhGV8nShcYbUVNveE6WvbqDFInRmTG6Zu8_BJvYh7zDnxvGq_-i7UlP8o_vq8V413qtJLlOQA-w=" +
                        "=?uid=283737439&filename=warsaw.png&disposition=inline&hash=&limit=0&content_type=" +
                        "image%2Fpng&owner_uid=283737439&fsize=73270&hid=ee138fd0275e771c5ba5f8b179d04476&media_type=" +
                        "image&tknv=v2&etag=52efb3a1116598139424b91cf90658a2&rtoken=BAocZ2FeYHsK&force_default=" +
                        "yes&ycrid=na-161f44c2ba2e1fadcedf53a4267a4607-downloader2f&ts=5f37c25123dc0&s=" +
                        "ebbe7d7f7a017f9e3d8d812843ec5a14e88f8434d5040a077096deb916914189&pb=" +
                        "U2FsdGVkX1-la1XzNeNR-JP4IZPt6nPd7mzXii6gLMopAjRkYMYnTV7YAYG5QB5FpwqNUA-9V9SbVqwB1a-OxrDgZ2l3DoksNLa4IEZE2X4"
            )
        )

        citiesArrayList.add(
            City(
                "Washington", "https://s358sas.storage.yandex.net/rdisk/" +
                        "3a79bc7defb8c380ddc4ee49ed68c46a45aacd2a11f04d3cdcc102d321f61ab9/63d7d63b/" +
                        "L2dzamNLZkNWhGV8nShcYX1RAkATpBY39wPzg4-EmJbcjS1stx5US-9rxNMfchrHP5me_t6UghbIsY-hR15LWw=" +
                        "=?uid=283737439&filename=washington.png&disposition=inline&hash=&limit=0&content_type=" +
                        "image%2Fpng&owner_uid=283737439&fsize=36765&hid=5c5e08b5398b3bb6601ed03a14c05b69&media_type=" +
                        "image&tknv=v2&etag=f4981b6b8b220b1adcc9c2f7660abbf0&rtoken=s2EvHAj1U8UZ&force_default=" +
                        "yes&ycrid=na-151007982c1a555d1538a9b7a59f539a-downloader2f&ts=5f37c28a5c4c0&s=" +
                        "811ddaee5a71cb6f82fac4cf5cbb30fc9e2f2be7ef350ecae848bc156814ca1f&pb=" +
                        "U2FsdGVkX1_yVsK2IOB0c3V2u-VcZCFdsLpIOGp-RQ3MnystTSWrpdZ4Q7bm9ZmOLUeoPNPKuaQFVoz8mIu9XqjmzANYYh_EtQM4RZ_9Fe4"
            )
        )

        return citiesArrayList
    }
}